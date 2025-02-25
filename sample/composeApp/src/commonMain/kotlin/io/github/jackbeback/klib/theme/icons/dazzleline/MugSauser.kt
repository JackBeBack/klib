package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MugSauser: ImageVector
    get() {
        if (_MugSauser != null) {
            return _MugSauser!!
        }
        _MugSauser = ImageVector.Builder(
            name = "MugSauser",
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
                moveTo(18.5f, 7f)
                horizontalLineTo(19f)
                curveTo(19.465f, 7f, 19.697f, 7f, 19.89f, 7.038f)
                curveTo(20.684f, 7.196f, 21.304f, 7.816f, 21.462f, 8.61f)
                curveTo(21.5f, 8.803f, 21.5f, 9.035f, 21.5f, 9.5f)
                curveTo(21.5f, 9.965f, 21.5f, 10.197f, 21.462f, 10.39f)
                curveTo(21.304f, 11.184f, 20.684f, 11.804f, 19.89f, 11.962f)
                curveTo(19.697f, 12f, 19.465f, 12f, 19f, 12f)
                horizontalLineTo(18.5f)
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                moveTo(12f, 17f)
                curveTo(10.606f, 17f, 9.908f, 17f, 9.333f, 16.862f)
                curveTo(7.505f, 16.423f, 6.077f, 14.995f, 5.638f, 13.167f)
                curveTo(5.5f, 12.592f, 5.5f, 11.894f, 5.5f, 10.5f)
                lineTo(5.5f, 7.2f)
                curveTo(5.5f, 6.08f, 5.5f, 5.52f, 5.718f, 5.092f)
                curveTo(5.91f, 4.716f, 6.216f, 4.41f, 6.592f, 4.218f)
                curveTo(7.02f, 4f, 7.58f, 4f, 8.7f, 4f)
                lineTo(15.3f, 4f)
                curveTo(16.42f, 4f, 16.98f, 4f, 17.408f, 4.218f)
                curveTo(17.784f, 4.41f, 18.09f, 4.716f, 18.282f, 5.092f)
                curveTo(18.5f, 5.52f, 18.5f, 6.08f, 18.5f, 7.2f)
                verticalLineTo(10.5f)
                curveTo(18.5f, 11.894f, 18.5f, 12.592f, 18.362f, 13.167f)
                curveTo(17.923f, 14.995f, 16.496f, 16.423f, 14.667f, 16.862f)
                curveTo(14.092f, 17f, 13.394f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _MugSauser!!
    }

@Suppress("ObjectPropertyName")
private var _MugSauser: ImageVector? = null
