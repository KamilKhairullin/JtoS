import com.bdui.server.jto.UiNamespace
import com.bdui.server.jto.model.size.FixedSize
import com.fasterxml.jackson.annotation.JsonUnwrapped
import java.awt.Color

class ColorRGB internal constructor(
    @JsonUnwrapped
    val properties: Properties
) {
    class Properties internal constructor(
        val red: Int,
        val green: Int,
        val blue: Int,
        val alpha: Int
    )
}

fun UiNamespace.color(
    color: Color
): ColorRGB = ColorRGB(
    ColorRGB.Properties(
        red = color.red,
        green = color.green,
        blue = color.blue,
        alpha = color.alpha
    )
)