package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BriefcaseAlt1: ImageVector
    get() {
        if (_BriefcaseAlt1 != null) {
            return _BriefcaseAlt1!!
        }
        _BriefcaseAlt1 = ImageVector.Builder(
            name = "BriefcaseAlt1",
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
                moveTo(16f, 7f)
                verticalLineTo(6.2f)
                curveTo(16f, 5.08f, 16f, 4.52f, 15.782f, 4.092f)
                curveTo(15.59f, 3.716f, 15.284f, 3.41f, 14.908f, 3.218f)
                curveTo(14.48f, 3f, 13.92f, 3f, 12.8f, 3f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 3f, 9.52f, 3f, 9.092f, 3.218f)
                curveTo(8.716f, 3.41f, 8.41f, 3.716f, 8.218f, 4.092f)
                curveTo(8f, 4.52f, 8f, 5.08f, 8f, 6.2f)
                verticalLineTo(7f)
                moveTo(4f, 12.236f)
                verticalLineTo(16.2f)
                curveTo(4f, 17.88f, 4f, 18.72f, 4.327f, 19.362f)
                curveTo(4.615f, 19.927f, 5.074f, 20.385f, 5.638f, 20.673f)
                curveTo(6.28f, 21f, 7.12f, 21f, 8.8f, 21f)
                horizontalLineTo(15.2f)
                curveTo(16.88f, 21f, 17.72f, 21f, 18.362f, 20.673f)
                curveTo(18.927f, 20.385f, 19.385f, 19.927f, 19.673f, 19.362f)
                curveTo(20f, 18.72f, 20f, 17.88f, 20f, 16.2f)
                verticalLineTo(12.236f)
                moveTo(9f, 15f)
                verticalLineTo(11f)
                moveTo(15f, 15f)
                verticalLineTo(11f)
                moveTo(3f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(8.2f)
                curveTo(21f, 9.88f, 21f, 10.72f, 20.673f, 11.362f)
                curveTo(20.385f, 11.927f, 19.927f, 12.385f, 19.362f, 12.673f)
                curveTo(18.72f, 13f, 17.88f, 13f, 16.2f, 13f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 13f, 5.28f, 13f, 4.638f, 12.673f)
                curveTo(4.074f, 12.385f, 3.615f, 11.927f, 3.327f, 11.362f)
                curveTo(3f, 10.72f, 3f, 9.88f, 3f, 8.2f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _BriefcaseAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseAlt1: ImageVector? = null
