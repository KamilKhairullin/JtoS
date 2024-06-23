import Foundation

struct Div: DivBase {
    
    // MARK: - Properties
    
    let type: DivType
    let id: String

    private enum CodingKeys: String, CodingKey {
        case type
        case id
    }
    
    init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        let typeString = try container.decode(String.self, forKey: .type)
        self.id = try container.decode(String.self, forKey: .id)
        
        switch typeString {
        case "image":
            self.type = .image(try DivImage(from: decoder))
        case "container":
            self.type = .container(try DivContainer(from: decoder))
        case "text":
            self.type = .text(try DivText(from: decoder))
        default:
            throw DecodingError.dataCorruptedError(forKey: .type, in: container, debugDescription: "Invalid div type")
        }
    }
}
