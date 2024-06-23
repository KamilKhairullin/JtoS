import Foundation

struct JtoView: Decodable, Equatable, Hashable {
    
    // MARK: - Properties

    let id: String
    let states: Array<State> 
}
