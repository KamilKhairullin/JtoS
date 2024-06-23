import Foundation

enum Size: Decodable {
    case fixed(value: Double)
    case matchParent(weight: Double)
    case wrapContent(maxSize: Double?, minSize: Double?)
    
    private enum CodingKeys: String, CodingKey {
        case type
        case value
        case weight
        case maxSize
        case minSize
    }
    
    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        let type = try container.decode(String.self, forKey: .type)
        
        switch type {
        case "fixedSize":
            let value = try container.decode(Double.self, forKey: .value)
            self = .fixed(value: value)
            
        case "matchParentSize":
            let weight = try container.decode(Double.self, forKey: .weight)
            self = .matchParent(weight: weight)
            
        case "wrapContentSize":
            let maxSize = try? container.decode(Double.self, forKey: .maxSize)
            let minSize = try? container.decode(Double.self, forKey: .minSize)
            self = .wrapContent(maxSize: maxSize, minSize: minSize)
            
        default:
            throw DecodingError.dataCorrupted(DecodingError.Context(codingPath: decoder.codingPath, debugDescription: "Invalid DivDimension type"))
        }
    }
    
    func getSize() -> CGFloat? {
        switch self {
        case .fixed(let value):
            return CGFloat(value)
        case .matchParent(let weight):
            return nil
        case .wrapContent(let maxSize, let minSize):
            return nil
        }
    }
    
    func getMaxSize() -> CGFloat? {
        switch self {
        case .fixed(let value):
            return nil
        case .matchParent(let weight):
            return CGFloat.infinity
        case .wrapContent(let maxSize, let minSize):
            return nil
        }
    }
}
