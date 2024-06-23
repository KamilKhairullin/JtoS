enum DivType: Decodable {
    case image(DivImage)
    case container(DivContainer)
    case text(DivText)
}

// MARK: - Equitable

extension DivType: Equatable {
    static func == (lhs: DivType, rhs: DivType) -> Bool {
        return true
    }
}

// MARK: - Hashable

extension DivType: Hashable {
    func hash(into hasher: inout Hasher) {
        hasher.combine("")
    }
}
