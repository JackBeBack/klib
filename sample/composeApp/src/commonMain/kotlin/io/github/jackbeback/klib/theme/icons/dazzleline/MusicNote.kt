package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MusicNote: ImageVector
    get() {
        if (_MusicNote != null) {
            return _MusicNote!!
        }
        _MusicNote = ImageVector.Builder(
            name = "MusicNote",
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
                moveTo(12.5f, 8.89f)
                verticalLineTo(18.5f)
                moveTo(12.5f, 8.89f)
                verticalLineTo(5.577f)
                curveTo(12.5f, 5.369f, 12.5f, 5.266f, 12.535f, 5.177f)
                curveTo(12.565f, 5.099f, 12.615f, 5.03f, 12.679f, 4.977f)
                curveTo(12.752f, 4.916f, 12.85f, 4.883f, 13.047f, 4.818f)
                lineTo(17.447f, 3.351f)
                curveTo(17.802f, 3.232f, 17.98f, 3.173f, 18.122f, 3.209f)
                curveTo(18.246f, 3.24f, 18.353f, 3.317f, 18.422f, 3.425f)
                curveTo(18.5f, 3.548f, 18.5f, 3.735f, 18.5f, 4.11f)
                verticalLineTo(7.423f)
                curveTo(18.5f, 7.631f, 18.5f, 7.734f, 18.465f, 7.823f)
                curveTo(18.435f, 7.9f, 18.385f, 7.969f, 18.321f, 8.023f)
                curveTo(18.248f, 8.084f, 18.15f, 8.117f, 17.953f, 8.182f)
                lineTo(13.553f, 9.649f)
                curveTo(13.198f, 9.767f, 13.02f, 9.827f, 12.878f, 9.791f)
                curveTo(12.754f, 9.76f, 12.647f, 9.683f, 12.578f, 9.575f)
                curveTo(12.5f, 9.452f, 12.5f, 9.265f, 12.5f, 8.89f)
                close()
                moveTo(12.5f, 18.5f)
                curveTo(12.5f, 19.881f, 10.933f, 21f, 9f, 21f)
                curveTo(7.067f, 21f, 5.5f, 19.881f, 5.5f, 18.5f)
                curveTo(5.5f, 17.119f, 7.067f, 16f, 9f, 16f)
                curveTo(10.933f, 16f, 12.5f, 17.119f, 12.5f, 18.5f)
                close()
            }
        }.build()

        return _MusicNote!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNote: ImageVector? = null
