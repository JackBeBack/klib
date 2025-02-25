package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneFlip: ImageVector
    get() {
        if (_PhoneFlip != null) {
            return _PhoneFlip!!
        }
        _PhoneFlip = ImageVector.Builder(
            name = "PhoneFlip",
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
                moveTo(21f, 5.5f)
                curveTo(21f, 14.06f, 14.06f, 21f, 5.5f, 21f)
                curveTo(5.114f, 21f, 4.731f, 20.986f, 4.352f, 20.958f)
                curveTo(3.917f, 20.926f, 3.699f, 20.91f, 3.501f, 20.796f)
                curveTo(3.337f, 20.702f, 3.181f, 20.535f, 3.099f, 20.364f)
                curveTo(3f, 20.158f, 3f, 19.918f, 3f, 19.438f)
                verticalLineTo(16.621f)
                curveTo(3f, 16.217f, 3f, 16.015f, 3.066f, 15.842f)
                curveTo(3.125f, 15.689f, 3.22f, 15.553f, 3.344f, 15.446f)
                curveTo(3.484f, 15.324f, 3.674f, 15.255f, 4.053f, 15.117f)
                lineTo(7.26f, 13.951f)
                curveTo(7.702f, 13.79f, 7.922f, 13.71f, 8.132f, 13.724f)
                curveTo(8.316f, 13.736f, 8.494f, 13.799f, 8.645f, 13.906f)
                curveTo(8.816f, 14.027f, 8.937f, 14.229f, 9.179f, 14.631f)
                lineTo(10f, 16f)
                curveTo(12.65f, 14.8f, 14.798f, 12.649f, 16f, 10f)
                lineTo(14.631f, 9.179f)
                curveTo(14.229f, 8.937f, 14.027f, 8.816f, 13.906f, 8.645f)
                curveTo(13.799f, 8.494f, 13.736f, 8.316f, 13.724f, 8.132f)
                curveTo(13.71f, 7.922f, 13.79f, 7.702f, 13.951f, 7.26f)
                lineTo(13.951f, 7.26f)
                lineTo(15.117f, 4.053f)
                curveTo(15.255f, 3.674f, 15.324f, 3.484f, 15.446f, 3.344f)
                curveTo(15.553f, 3.22f, 15.689f, 3.125f, 15.842f, 3.066f)
                curveTo(16.015f, 3f, 16.217f, 3f, 16.621f, 3f)
                horizontalLineTo(19.438f)
                curveTo(19.918f, 3f, 20.158f, 3f, 20.364f, 3.099f)
                curveTo(20.535f, 3.181f, 20.702f, 3.337f, 20.796f, 3.501f)
                curveTo(20.91f, 3.699f, 20.926f, 3.917f, 20.958f, 4.352f)
                curveTo(20.986f, 4.731f, 21f, 5.114f, 21f, 5.5f)
                close()
            }
        }.build()

        return _PhoneFlip!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneFlip: ImageVector? = null
