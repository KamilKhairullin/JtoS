import Foundation

protocol DivBase: Decodable, Equatable, Hashable {
    var type: DivType { get }
}
