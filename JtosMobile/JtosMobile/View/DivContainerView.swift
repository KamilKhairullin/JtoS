import SwiftUI

struct DivContainerView: View {
    
    let divContainer: DivContainer
    
    var body: some View {
        buildContainerView(divContainer)
    }
    
    
    @ViewBuilder
    private func buildContainerView(_ containerData: DivContainer) -> some View {
        if containerData.orientation == .horizontal {
            HStack {
                ForEach(containerData.items, id: \.type) { item in
                    DivView(div: item)
                }
                .frame(
                    width: containerData.width.getSize(),
                    height: containerData.height.getSize()
                )
                .padding(containerData.padding.toSwiftUI())
                .background(Color(uiColor: containerData.backgroundColor.toUIColor()))
                .cornerRadius(CGFloat(containerData.cornerRadius))
            }
        } else {
            VStack {
                ForEach(containerData.items, id: \.type) { item in
                    DivView(div: item)
                }
                .frame(
                    width: containerData.width.getSize(),
                    height: containerData.height.getSize()
                )
                .padding(containerData.padding.toSwiftUI())
                .background(Color(uiColor: containerData.backgroundColor.toUIColor()))
                .cornerRadius(CGFloat(containerData.cornerRadius))
            }
        }
    }
}
