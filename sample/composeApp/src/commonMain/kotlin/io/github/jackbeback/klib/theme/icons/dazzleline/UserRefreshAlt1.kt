package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserRefreshAlt1: ImageVector
    get() {
        if (_UserRefreshAlt1 != null) {
            return _UserRefreshAlt1!!
        }
        _UserRefreshAlt1 = ImageVector.Builder(
            name = "UserRefreshAlt1",
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
                moveTo(4f, 21f)
                curveTo(4f, 17.134f, 7.134f, 14f, 11f, 14f)
                moveTo(18.5f, 20.236f)
                curveTo(17.969f, 20.711f, 17.268f, 21f, 16.5f, 21f)
                curveTo(14.843f, 21f, 13.5f, 19.657f, 13.5f, 18f)
                curveTo(13.5f, 16.343f, 14.843f, 15f, 16.5f, 15f)
                curveTo(17.806f, 15f, 18.917f, 15.835f, 19.329f, 17f)
                moveTo(20f, 14.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(17f)
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserRefreshAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserRefreshAlt1: ImageVector? = null
