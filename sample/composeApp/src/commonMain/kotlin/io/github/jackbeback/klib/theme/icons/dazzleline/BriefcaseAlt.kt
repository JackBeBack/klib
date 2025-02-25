package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BriefcaseAlt: ImageVector
    get() {
        if (_BriefcaseAlt != null) {
            return _BriefcaseAlt!!
        }
        _BriefcaseAlt = ImageVector.Builder(
            name = "BriefcaseAlt",
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
                moveTo(3.027f, 10.026f)
                curveTo(3.388f, 10.372f, 7.286f, 14f, 12f, 14f)
                curveTo(16.714f, 14f, 20.612f, 10.372f, 20.973f, 10.026f)
                moveTo(3.027f, 10.026f)
                curveTo(3f, 10.493f, 3f, 11.066f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 11.066f, 21f, 10.493f, 20.973f, 10.026f)
                moveTo(3.027f, 10.026f)
                curveTo(3.062f, 9.424f, 3.143f, 9f, 3.327f, 8.638f)
                curveTo(3.615f, 8.074f, 4.074f, 7.615f, 4.638f, 7.327f)
                curveTo(5.28f, 7f, 6.12f, 7f, 7.8f, 7f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 7f, 18.72f, 7f, 19.362f, 7.327f)
                curveTo(19.927f, 7.615f, 20.385f, 8.074f, 20.673f, 8.638f)
                curveTo(20.857f, 9f, 20.938f, 9.424f, 20.973f, 10.026f)
            }
        }.build()

        return _BriefcaseAlt!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseAlt: ImageVector? = null
