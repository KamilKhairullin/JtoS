import SwiftUI

struct DivView: View {
    
    let div: Div
    
    var body: some View {
        switch div.type {
        case .image(let divImage):
            DivImageView(divImage: divImage)
        case .container(let divContainer):
            DivContainerView(divContainer: divContainer)
        case .text(let divText):
            DivTextView(divText: divText)
        }
    }
}
