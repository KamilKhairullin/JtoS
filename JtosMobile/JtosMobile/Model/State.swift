import Foundation

struct State: Decodable, Equatable, Hashable {
    
    // MARK: - Properties

    let stateId: String
    let div: Div
}
