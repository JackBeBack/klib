package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserXmarkAlt1: ImageVector
    get() {
        if (_UserXmarkAlt1 != null) {
            return _UserXmarkAlt1!!
        }
        _UserXmarkAlt1 = ImageVector.Builder(
            name = "UserXmarkAlt1",
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
                moveTo(15f, 16f)
                lineTo(20f, 21f)
                moveTo(20f, 16f)
                lineTo(15f, 21f)
                moveTo(4f, 21f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserXmarkAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserXmarkAlt1: ImageVector? = null
