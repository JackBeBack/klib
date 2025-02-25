package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSearch: ImageVector
    get() {
        if (_CloudSearch != null) {
            return _CloudSearch!!
        }
        _CloudSearch = ImageVector.Builder(
            name = "CloudSearch",
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
                moveTo(13.5f, 14.5f)
                lineTo(14.5f, 15.5f)
                moveTo(14f, 12.5f)
                curveTo(14f, 13.881f, 12.881f, 15f, 11.5f, 15f)
                curveTo(10.119f, 15f, 9f, 13.881f, 9f, 12.5f)
                curveTo(9f, 11.119f, 10.119f, 10f, 11.5f, 10f)
                curveTo(12.881f, 10f, 14f, 11.119f, 14f, 12.5f)
                close()
                moveTo(8.4f, 19f)
                curveTo(5.418f, 19f, 3f, 16.604f, 3f, 13.649f)
                curveTo(3f, 11.2f, 4.8f, 8.938f, 7.5f, 8.5f)
                curveTo(8.347f, 6.486f, 10.351f, 5f, 12.689f, 5f)
                curveTo(15.684f, 5f, 18.132f, 7.323f, 18.3f, 10.25f)
                curveTo(19.889f, 10.945f, 21f, 12.65f, 21f, 14.497f)
                curveTo(21f, 16.984f, 18.985f, 19f, 16.5f, 19f)
                lineTo(8.4f, 19f)
                close()
            }
        }.build()

        return _CloudSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSearch: ImageVector? = null
