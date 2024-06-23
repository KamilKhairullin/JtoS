struct DivImage: Decodable {
    let imageUrl: String
    let contentMode: DivContentMode
    let width: Size
    let height: Size
    let padding: DivEdgeInsets
}
