package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserSearch: ImageVector
    get() {
        if (_UserSearch != null) {
            return _UserSearch!!
        }
        _UserSearch = ImageVector.Builder(
            name = "UserSearch",
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
                moveTo(18.5f, 19.5f)
                lineTo(20f, 21f)
                moveTo(11f, 14f)
                curveTo(7.134f, 14f, 4f, 17.134f, 4f, 21f)
                horizontalLineTo(11f)
                moveTo(19f, 17.5f)
                curveTo(19f, 18.881f, 17.881f, 20f, 16.5f, 20f)
                curveTo(15.119f, 20f, 14f, 18.881f, 14f, 17.5f)
                curveTo(14f, 16.119f, 15.119f, 15f, 16.5f, 15f)
                curveTo(17.881f, 15f, 19f, 16.119f, 19f, 17.5f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserSearch!!
    }

@Suppress("ObjectPropertyName")
private var _UserSearch: ImageVector? = null
