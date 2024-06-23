import Foundation

struct ScreenResponse: Decodable, Equatable, Hashable {
    
    // MARK: - Properties
    
    let ui: Array<Section>
    
}
