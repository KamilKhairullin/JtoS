import SwiftUI

struct DivContainerView: View {
    
    let divContainer: DivContainer
    
    var body: some View {
        buildContainerView(divContainer)
    }
    
    
    @ViewBuilder
    private func buildContainerView(_ containerData: DivContainer) -> some View {
        if containerData.orientation == .horizontal {
            HStack(spacing: 0) {
                ForEach(containerData.items, id: \.id) { item in
                    DivView(div: item)
                }
            }
            .frame(
                width: containerData.width.getSize(),
                height: containerData.height.getSize()
            )
            .frame(
                maxWidth: containerData.width.getMaxSize(),
                maxHeight: containerData.height.getMaxSize()
            )
            .padding(containerData.padding.toSwiftUI())
            .background(Color(uiColor: containerData.backgroundColor.toUIColor()))
            .cornerRadius(CGFloat(containerData.cornerRadius))
        } else {
            VStack(spacing: 0) {
                ForEach(containerData.items, id: \.id) { item in
                    DivView(div: item)
                }
            }
            .frame(
                width: containerData.width.getSize(),
                height: containerData.height.getSize()
            )
            .frame(
                maxWidth: containerData.width.getMaxSize(),
                maxHeight: containerData.height.getMaxSize()
            )
            .padding(containerData.padding.toSwiftUI())
            .background(Color(uiColor: containerData.backgroundColor.toUIColor()))
            .cornerRadius(CGFloat(containerData.cornerRadius))
        }
    }
}
