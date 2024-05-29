import SwiftUI

struct JtoSView: View {

    var model: JtoS
    
    var body: some View {
        if model == .empty {
            empty
        } else {
            switch model.type {
            case "text":
                let params = ParamsText(params: model.params)
                Text(params.value)
                    .apply(params: params)

            case "image":
                let params = ParamsImage(params: model.params)
                AsyncImage(url: URL(string: model.params.url ?? "")) { result in
                    result.image?
                        .resizable()
                        .aspectRatio(contentMode: params.contentMode)
                }
                    .apply(params: params)

            case "v_stack":
                let params = ParamsVStack(params: model.params)
                VStack(alignment: params.alignment, spacing: params.spacing) {
                    if let ui = model.ui {
                        ForEach(ui, id: \.self) { elemModel in JtoSView(model: elemModel) }
                    } else { empty }
                }
                .apply(params: params)

            case "h_stack":
                let params = ParamsHStack(params: model.params)
                HStack(alignment: params.alignment, spacing: params.spacing) {
                    if let ui = model.ui {
                        ForEach(ui, id: \.self) { elemModel in JtoSView(model: elemModel) }
                    } else { empty }
                }
                .apply(params: params)

            default:
                JtoSView(model: .empty)
            }
        }
    }
}

extension JtoSView {

    var empty: some View {
        Color(.clear)
    }
}
