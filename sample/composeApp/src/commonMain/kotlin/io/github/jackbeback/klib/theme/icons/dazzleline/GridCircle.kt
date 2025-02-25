package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GridCircle: ImageVector
    get() {
        if (_GridCircle != null) {
            return _GridCircle!!
        }
        _GridCircle = ImageVector.Builder(
            name = "GridCircle",
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
                curveTo(4f, 5.343f, 5.343f, 4f, 7f, 4f)
                curveTo(8.657f, 4f, 10f, 5.343f, 10f, 7f)
                curveTo(10f, 8.657f, 8.657f, 10f, 7f, 10f)
                curveTo(5.343f, 10f, 4f, 8.657f, 4f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                curveTo(14f, 5.343f, 15.343f, 4f, 17f, 4f)
                curveTo(18.657f, 4f, 20f, 5.343f, 20f, 7f)
                curveTo(20f, 8.657f, 18.657f, 10f, 17f, 10f)
                curveTo(15.343f, 10f, 14f, 8.657f, 14f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                curveTo(14f, 15.343f, 15.343f, 14f, 17f, 14f)
                curveTo(18.657f, 14f, 20f, 15.343f, 20f, 17f)
                curveTo(20f, 18.657f, 18.657f, 20f, 17f, 20f)
                curveTo(15.343f, 20f, 14f, 18.657f, 14f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 17f)
                curveTo(4f, 15.343f, 5.343f, 14f, 7f, 14f)
                curveTo(8.657f, 14f, 10f, 15.343f, 10f, 17f)
                curveTo(10f, 18.657f, 8.657f, 20f, 7f, 20f)
                curveTo(5.343f, 20f, 4f, 18.657f, 4f, 17f)
                close()
            }
        }.build()

        return _GridCircle!!
    }

@Suppress("ObjectPropertyName")
private var _GridCircle: ImageVector? = null
