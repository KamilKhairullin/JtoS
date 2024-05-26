import SwiftUI

struct ContentView: View {

    // MARK: Internal Properties

    @State var jtos: JtoS
    @State var arr: [JtoS] = [
        .init(type: "1", params: .init()),
        .init(type: "2", params: .init()),
        .init(type: "3", params: .init()),
        .init(type: "4", params: .init()),
        .init(type: "5", params: .init()),
        .init(type: "6", params: .init())
    ]

    // MARK: Body

    var body: some View {
        JtoSView(model: jtos)
            .onAppear {
                getJtoSModel()
            }
            .foregroundColor(<#T##color: Color?##Color?#>)
        
    }
}



extension ContentView {

    func foo() {
        if let jtos = JtoSConverter.decodeMockJSON(for: .catalog) {
            jtos.traverseModel()
        }
    }

    func getJtoSModel() {
        if let jtos = JtoSConverter.decodeMockJSON(for: .catalog) {
            jtos.traverseModel()
            self.jtos = jtos
        } else {
            print("suka")
        }
    }
}

#Preview { ContentView(jtos: .empty) }
