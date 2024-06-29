import SwiftUI

struct JtoSRootView: View {

    // MARK: Private Properties

    @State private var jtos: JtoS = .empty

    private var store: JtoSStore = .init()
    private let resource: ResourceType

    // MARK: Body

    var body: some View {
        JtoSView(model: $jtos)
            .environmentObject(store)
            .onAppear {
                switch resource {
                case let .url(string):
                    getDataFromUrl(string)
                case let .mock(filename):
                    getJtoSModelFromMock(filename)
                }
        }
    }

    // MARK: Init

    init(resource: ResourceType) {
        self.resource = resource
    }
}

extension JtoSRootView {

    enum ResourceType {

        case url(string: String)
        case mock(filename: String)
    }

}

extension JtoSRootView {

    private func getDataFromUrl(_ urlString: String) {
        jtos = .empty
    }

    private func getJtoSModelFromMock(_ filename: String) {
        let model = JtoSConverter.decodeMockJSON(from: filename)

        if let model = model {
//            model.traverseModel()
            jtos = model
        } else {
            jtos = .empty
        }
    }
}
