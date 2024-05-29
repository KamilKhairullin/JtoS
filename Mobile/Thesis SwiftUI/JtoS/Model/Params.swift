import Foundation

struct Params: Decodable, Equatable, Hashable {

    // MARK: Nested Types

    struct Size: Decodable, Equatable, Hashable {

        let w: Int
        let h: Int
    }

    // MARK: - Internal Properties

    // MARK: Common

    var size: Size?                 = nil
    var color: String?              = nil
    var corner_radius: String?      = nil

    // MARK: Text

    var value: String?              = nil
    var font: String?               = nil
    var font_size: Int?             = nil

    // MARK: Image

    var url: String?                = nil
    var content_mode: String?       = nil

    // MARK: VStack

    var alignment: String?          = nil
    var spacing: Int?               = nil
}
