import Foundation
import SwiftUI

enum DivContentMode: String, Decodable {
    case fill
    case fit

    func toSwiftUI() -> ContentMode {
        switch(self) {
        case .fill:
            return .fill
        case .fit:
            return .fit
        }
    }
}
