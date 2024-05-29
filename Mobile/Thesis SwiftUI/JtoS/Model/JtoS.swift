import Foundation

struct JtoS: Decodable, Equatable, Hashable {
    
    // MARK: Internal Properties

    let type: String
    let params: Params
    var ui: [JtoS]?
}


extension JtoS {

    // MARK: Type Properties

    static let empty: JtoS = .init(type: "", params: .init())
}
