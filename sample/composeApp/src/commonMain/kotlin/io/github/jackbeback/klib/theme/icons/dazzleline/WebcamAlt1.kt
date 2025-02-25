package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WebcamAlt1: ImageVector
    get() {
        if (_WebcamAlt1 != null) {
            return _WebcamAlt1!!
        }
        _WebcamAlt1 = ImageVector.Builder(
            name = "WebcamAlt1",
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
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                moveTo(9f, 17f)
                verticalLineTo(21f)
                moveTo(15f, 17f)
                verticalLineTo(21f)
                moveTo(15f, 10f)
                curveTo(15f, 11.657f, 13.657f, 13f, 12f, 13f)
                curveTo(10.343f, 13f, 9f, 11.657f, 9f, 10f)
                curveTo(9f, 8.343f, 10.343f, 7f, 12f, 7f)
                curveTo(13.657f, 7f, 15f, 8.343f, 15f, 10f)
                close()
                moveTo(8.8f, 17f)
                horizontalLineTo(15.2f)
                curveTo(16.88f, 17f, 17.72f, 17f, 18.362f, 16.673f)
                curveTo(18.927f, 16.385f, 19.385f, 15.927f, 19.673f, 15.362f)
                curveTo(20f, 14.72f, 20f, 13.88f, 20f, 12.2f)
                verticalLineTo(7.8f)
                curveTo(20f, 6.12f, 20f, 5.28f, 19.673f, 4.638f)
                curveTo(19.385f, 4.074f, 18.927f, 3.615f, 18.362f, 3.327f)
                curveTo(17.72f, 3f, 16.88f, 3f, 15.2f, 3f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 3f, 6.28f, 3f, 5.638f, 3.327f)
                curveTo(5.074f, 3.615f, 4.615f, 4.074f, 4.327f, 4.638f)
                curveTo(4f, 5.28f, 4f, 6.12f, 4f, 7.8f)
                verticalLineTo(12.2f)
                curveTo(4f, 13.88f, 4f, 14.72f, 4.327f, 15.362f)
                curveTo(4.615f, 15.927f, 5.074f, 16.385f, 5.638f, 16.673f)
                curveTo(6.28f, 17f, 7.12f, 17f, 8.8f, 17f)
                close()
            }
        }.build()

        return _WebcamAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamAlt1: ImageVector? = null
