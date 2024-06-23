import SwiftUI

@main
struct JtosMobileApp: App {
    var body: some Scene {
        WindowGroup {
            let query = ScreenQuery(path: "/api/screen/test", params: [:], body: [:])
            let viewModel = ScreenEngineViewModel(query: query)
            ScreenEngineView(viewModel: viewModel)
        }
    }
}
