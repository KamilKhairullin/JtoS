import Foundation

enum JsonReader {
    
    static func readMock(path: String) -> ScreenResponse? {
        guard let url = Bundle.main.url(forResource: path, withExtension: "json") else {
            return nil
        }
        
        do {
            let data = try Data(contentsOf: url)
            let decoder = JSONDecoder()
            decoder.keyDecodingStrategy = .convertFromSnakeCase
            return try decoder.decode(ScreenResponse.self, from: data)
        } catch {
            debugPrint("Failed to read mock with error: \(error)")
            return nil
        }
    }
}
