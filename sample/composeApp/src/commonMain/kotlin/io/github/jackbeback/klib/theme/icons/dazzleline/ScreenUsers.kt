package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ScreenUsers: ImageVector
    get() {
        if (_ScreenUsers != null) {
            return _ScreenUsers!!
        }
        _ScreenUsers = ImageVector.Builder(
            name = "ScreenUsers",
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
                moveTo(20f, 10f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.806f, 5.092f)
                curveTo(19.635f, 4.716f, 19.364f, 4.41f, 19.029f, 4.218f)
                curveTo(18.649f, 4f, 18.151f, 4f, 17.155f, 4f)
                horizontalLineTo(6.844f)
                curveTo(5.849f, 4f, 5.351f, 4f, 4.97f, 4.218f)
                curveTo(4.636f, 4.41f, 4.364f, 4.716f, 4.194f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(10f)
                moveTo(6.339f, 14f)
                horizontalLineTo(6.349f)
                moveTo(3.51f, 20f)
                curveTo(3.922f, 18.835f, 5.033f, 18f, 6.339f, 18f)
                curveTo(7.645f, 18f, 8.757f, 18.835f, 9.168f, 20f)
                moveTo(11.999f, 14f)
                horizontalLineTo(12.009f)
                moveTo(9.17f, 20f)
                curveTo(9.582f, 18.835f, 10.693f, 18f, 11.999f, 18f)
                curveTo(13.305f, 18f, 14.417f, 18.835f, 14.828f, 20f)
                moveTo(17.659f, 14f)
                horizontalLineTo(17.669f)
                moveTo(14.83f, 20f)
                curveTo(15.241f, 18.835f, 16.353f, 18f, 17.659f, 18f)
                curveTo(18.965f, 18f, 20.076f, 18.835f, 20.488f, 20f)
                moveTo(7.339f, 14f)
                curveTo(7.339f, 14.552f, 6.891f, 15f, 6.339f, 15f)
                curveTo(5.787f, 15f, 5.339f, 14.552f, 5.339f, 14f)
                curveTo(5.339f, 13.448f, 5.787f, 13f, 6.339f, 13f)
                curveTo(6.891f, 13f, 7.339f, 13.448f, 7.339f, 14f)
                close()
                moveTo(12.999f, 14f)
                curveTo(12.999f, 14.552f, 12.551f, 15f, 11.999f, 15f)
                curveTo(11.447f, 15f, 10.999f, 14.552f, 10.999f, 14f)
                curveTo(10.999f, 13.448f, 11.447f, 13f, 11.999f, 13f)
                curveTo(12.551f, 13f, 12.999f, 13.448f, 12.999f, 14f)
                close()
                moveTo(18.659f, 14f)
                curveTo(18.659f, 14.552f, 18.211f, 15f, 17.659f, 15f)
                curveTo(17.107f, 15f, 16.659f, 14.552f, 16.659f, 14f)
                curveTo(16.659f, 13.448f, 17.107f, 13f, 17.659f, 13f)
                curveTo(18.211f, 13f, 18.659f, 13.448f, 18.659f, 14f)
                close()
            }
        }.build()

        return _ScreenUsers!!
    }

@Suppress("ObjectPropertyName")
private var _ScreenUsers: ImageVector? = null
