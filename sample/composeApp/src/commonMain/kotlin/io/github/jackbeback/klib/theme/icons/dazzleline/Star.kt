package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.269f, 4.411f)
                curveTo(11.501f, 3.892f, 11.616f, 3.632f, 11.778f, 3.552f)
                curveTo(11.918f, 3.483f, 12.082f, 3.483f, 12.222f, 3.552f)
                curveTo(12.383f, 3.632f, 12.499f, 3.892f, 12.731f, 4.411f)
                lineTo(14.575f, 8.548f)
                curveTo(14.643f, 8.702f, 14.677f, 8.778f, 14.73f, 8.837f)
                curveTo(14.777f, 8.889f, 14.834f, 8.931f, 14.898f, 8.959f)
                curveTo(14.97f, 8.991f, 15.054f, 9f, 15.221f, 9.018f)
                lineTo(19.726f, 9.493f)
                curveTo(20.291f, 9.553f, 20.574f, 9.583f, 20.7f, 9.711f)
                curveTo(20.809f, 9.823f, 20.86f, 9.98f, 20.837f, 10.134f)
                curveTo(20.811f, 10.312f, 20.6f, 10.502f, 20.177f, 10.883f)
                lineTo(16.813f, 13.915f)
                curveTo(16.688f, 14.028f, 16.625f, 14.084f, 16.586f, 14.153f)
                curveTo(16.551f, 14.213f, 16.529f, 14.281f, 16.521f, 14.35f)
                curveTo(16.513f, 14.429f, 16.531f, 14.511f, 16.566f, 14.676f)
                lineTo(17.505f, 19.106f)
                curveTo(17.623f, 19.663f, 17.682f, 19.941f, 17.599f, 20.1f)
                curveTo(17.526f, 20.239f, 17.393f, 20.335f, 17.239f, 20.361f)
                curveTo(17.062f, 20.392f, 16.816f, 20.25f, 16.323f, 19.965f)
                lineTo(12.399f, 17.702f)
                curveTo(12.254f, 17.618f, 12.181f, 17.576f, 12.104f, 17.56f)
                curveTo(12.035f, 17.545f, 11.964f, 17.545f, 11.896f, 17.56f)
                curveTo(11.818f, 17.576f, 11.746f, 17.618f, 11.6f, 17.702f)
                lineTo(7.677f, 19.965f)
                curveTo(7.184f, 20.25f, 6.938f, 20.392f, 6.76f, 20.361f)
                curveTo(6.606f, 20.335f, 6.473f, 20.239f, 6.401f, 20.1f)
                curveTo(6.317f, 19.941f, 6.376f, 19.663f, 6.494f, 19.106f)
                lineTo(7.434f, 14.676f)
                curveTo(7.469f, 14.511f, 7.486f, 14.429f, 7.478f, 14.35f)
                curveTo(7.471f, 14.281f, 7.449f, 14.213f, 7.414f, 14.153f)
                curveTo(7.374f, 14.084f, 7.312f, 14.028f, 7.187f, 13.915f)
                lineTo(3.822f, 10.883f)
                curveTo(3.4f, 10.502f, 3.189f, 10.312f, 3.163f, 10.134f)
                curveTo(3.14f, 9.98f, 3.191f, 9.823f, 3.3f, 9.711f)
                curveTo(3.426f, 9.583f, 3.709f, 9.553f, 4.274f, 9.493f)
                lineTo(8.778f, 9.018f)
                curveTo(8.946f, 9f, 9.029f, 8.991f, 9.101f, 8.959f)
                curveTo(9.165f, 8.931f, 9.223f, 8.889f, 9.269f, 8.837f)
                curveTo(9.322f, 8.778f, 9.357f, 8.702f, 9.425f, 8.548f)
                lineTo(11.269f, 4.411f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
