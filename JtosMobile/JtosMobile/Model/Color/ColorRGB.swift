import Foundation
import SwiftUI

struct ColorRGB: Decodable {
    let red: Int
    let green: Int
    let blue: Int
    let alpha: Int
    
    private enum CodingKeys: String, CodingKey {
        case red
        case green
        case blue
        case alpha
    }
    
    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        red = try container.decodeIfPresent(Int.self, forKey: .red) ?? 0
        green = try container.decodeIfPresent(Int.self, forKey: .green) ?? 0
        blue = try container.decodeIfPresent(Int.self, forKey: .blue) ?? 0
        alpha = try container.decodeIfPresent(Int.self, forKey: .alpha) ?? 0
    }
    
    func toUIColor() -> UIColor {
        return UIColor(
            red: CGFloat(red) / 255,
            green: CGFloat(green) / 255,
            blue: CGFloat(blue) / 255,
            alpha: CGFloat(alpha) / 100
        )
    }
}
