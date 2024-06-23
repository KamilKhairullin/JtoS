import SwiftUI
import Combine

struct ScreenEngineView: View {
    
    @ObservedObject var viewModel: ScreenEngineViewModel
    
    var body: some View {
        NavigationStack {
            VStack {
                if viewModel.loading {
                    ProgressView()
                } else if let screenResponse = viewModel.screenResponse {
                    ZStack {
                        ScrollView {
                            ForEach(screenResponse.ui, id: \.self.id) { section in
                               SectionView(section: section)
                           }
                        }
                        .frame(
                            maxWidth: .infinity,
                            maxHeight: .infinity
                        )
                        .refreshable {
                            viewModel.fetchData()
                        }
                    }
                } else if let error = viewModel.error {
                    Text("Error: \(error.localizedDescription)")
                    Button("Reload", action: viewModel.fetchData)
                } else {
                    Text("No data available")
                    Button("Reload", action: viewModel.fetchData)
                }
            }
            .onAppear {
                viewModel.fetchData()
            }
        }
    }
}
