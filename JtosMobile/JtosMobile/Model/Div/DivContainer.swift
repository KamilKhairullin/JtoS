struct DivContainer: Decodable {
    let width: Size
    let height: Size
    let padding: DivEdgeInsets
    let items: Array<Div>
    let orientation: DivOrientation
    let cornerRadius: Int
    let backgroundColor: ColorRGB
}
