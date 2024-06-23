import Foundation
import SwiftUI

struct DivEdgeInsets: Decodable {
    let bottom: Int
    let left: Int
    let top: Int
    let right: Int
    
    private enum CodingKeys: String, CodingKey {
        case bottom
        case left
        case top
        case right
    }
    
    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        bottom = try container.decodeIfPresent(Int.self, forKey: .bottom) ?? 0
        left = try container.decodeIfPresent(Int.self, forKey: .left) ?? 0
        top = try container.decodeIfPresent(Int.self, forKey: .top) ?? 0
        right = try container.decodeIfPresent(Int.self, forKey: .right) ?? 0

    }
    
    func toSwiftUI() -> EdgeInsets {
        return EdgeInsets(
            top: CGFloat(self.top),
            leading: CGFloat(self.left),
            bottom: CGFloat(self.bottom),
            trailing: CGFloat(self.right)
        )
    }
}
