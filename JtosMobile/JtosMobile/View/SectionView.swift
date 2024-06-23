import SwiftUI

struct SectionView: View {

    // MARK: - Properties
    
    var section: Section

    var body: some View {
        buildView(from: section)
    }
    
    // MARK: - Private
    
    @ViewBuilder
    private func buildView(from section: Section) -> some View {
        ZStack {
            ScrollView {
                ForEach(section.views, id: \.self.id) { view in
                    if let div = view.states.first?.div {
                        DivView(div: div)
                    } else {
                        EmptyView()
                    }
                }
            }
            .frame(
                maxWidth: .infinity,
                maxHeight: .infinity
            )
        }
    }
}
