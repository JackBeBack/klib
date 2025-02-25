package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlbumCollection: ImageVector
    get() {
        if (_AlbumCollection != null) {
            return _AlbumCollection!!
        }
        _AlbumCollection = ImageVector.Builder(
            name = "AlbumCollection",
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
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                moveTo(6.896f, 20f)
                horizontalLineTo(17.104f)
                curveTo(18.128f, 20f, 18.639f, 20f, 19.045f, 19.808f)
                curveTo(19.402f, 19.64f, 19.701f, 19.369f, 19.905f, 19.03f)
                curveTo(20.136f, 18.645f, 20.187f, 18.136f, 20.288f, 17.118f)
                lineTo(20.736f, 12.639f)
                curveTo(20.828f, 11.724f, 20.874f, 11.267f, 20.724f, 10.914f)
                curveTo(20.592f, 10.603f, 20.359f, 10.347f, 20.063f, 10.184f)
                curveTo(19.727f, 10f, 19.267f, 10f, 18.348f, 10f)
                horizontalLineTo(5.652f)
                curveTo(4.733f, 10f, 4.274f, 10f, 3.937f, 10.184f)
                curveTo(3.641f, 10.347f, 3.409f, 10.603f, 3.277f, 10.914f)
                curveTo(3.127f, 11.267f, 3.173f, 11.724f, 3.264f, 12.639f)
                lineTo(3.712f, 17.118f)
                curveTo(3.814f, 18.136f, 3.865f, 18.645f, 4.096f, 19.03f)
                curveTo(4.299f, 19.369f, 4.599f, 19.64f, 4.956f, 19.808f)
                curveTo(5.362f, 20f, 5.873f, 20f, 6.896f, 20f)
                close()
                moveTo(15f, 15f)
                curveTo(15f, 16.105f, 13.657f, 17f, 12f, 17f)
                curveTo(10.344f, 17f, 9f, 16.105f, 9f, 15f)
                curveTo(9f, 13.895f, 10.344f, 13f, 12f, 13f)
                curveTo(13.657f, 13f, 15f, 13.895f, 15f, 15f)
                close()
            }
        }.build()

        return _AlbumCollection!!
    }

@Suppress("ObjectPropertyName")
private var _AlbumCollection: ImageVector? = null
