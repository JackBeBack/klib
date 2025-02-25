package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserCheckAlt1: ImageVector
    get() {
        if (_UserCheckAlt1 != null) {
            return _UserCheckAlt1!!
        }
        _UserCheckAlt1 = ImageVector.Builder(
            name = "UserCheckAlt1",
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
                moveTo(14f, 19.286f)
                lineTo(15.8f, 21f)
                lineTo(20f, 17f)
                moveTo(4f, 21f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                curveTo(12.487f, 14f, 13.866f, 14.464f, 15f, 15.255f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserCheckAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserCheckAlt1: ImageVector? = null
