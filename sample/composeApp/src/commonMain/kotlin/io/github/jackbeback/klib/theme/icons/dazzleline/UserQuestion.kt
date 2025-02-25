package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserQuestion: ImageVector
    get() {
        if (_UserQuestion != null) {
            return _UserQuestion!!
        }
        _UserQuestion = ImageVector.Builder(
            name = "UserQuestion",
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
                moveTo(12f, 14.071f)
                curveTo(11.673f, 14.024f, 11.34f, 14f, 11f, 14f)
                curveTo(7.134f, 14f, 4f, 17.134f, 4f, 21f)
                horizontalLineTo(14f)
                moveTo(17.997f, 18f)
                curveTo(18.997f, 17f, 19.997f, 16.605f, 19.997f, 15.5f)
                curveTo(19.997f, 14.395f, 19.102f, 13.5f, 17.997f, 13.5f)
                curveTo(17.065f, 13.5f, 16.282f, 14.137f, 16.06f, 15f)
                moveTo(17.997f, 21f)
                horizontalLineTo(18.007f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _UserQuestion: ImageVector? = null
