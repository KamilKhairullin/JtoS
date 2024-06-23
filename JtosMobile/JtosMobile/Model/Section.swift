import Foundation

struct Section: Decodable, Equatable, Hashable {
    
    // MARK: - Properties
    
    let id: String
    let views: Array<JtoView>
    
}
