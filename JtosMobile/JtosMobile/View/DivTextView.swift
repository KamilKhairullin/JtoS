import SwiftUI

struct DivTextView: View {
    
    let divText: DivText
    
    var body: some View {
        buildTextView(divText)
    }
    
    
    @ViewBuilder
    private func buildTextView(_ textData: DivText) -> some View {
        Text(textData.text)
            .font(.system(size: CGFloat(textData.fontSize)))
            .frame(
                width: textData.width.getSize(),
                height: textData.height.getSize()
            )
            .padding(textData.padding.toSwiftUI())
    }
}
