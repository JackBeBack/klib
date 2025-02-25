package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseLockAlt: ImageVector
    get() {
        if (_HouseLockAlt != null) {
            return _HouseLockAlt!!
        }
        _HouseLockAlt = ImageVector.Builder(
            name = "HouseLockAlt",
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
                moveTo(10f, 13f)
                verticalLineTo(12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                verticalLineTo(13f)
                moveTo(3f, 14.6f)
                verticalLineTo(12.13f)
                curveTo(3f, 10.981f, 3f, 10.407f, 3.148f, 9.878f)
                curveTo(3.279f, 9.41f, 3.495f, 8.969f, 3.784f, 8.578f)
                curveTo(4.111f, 8.136f, 4.564f, 7.783f, 5.471f, 7.078f)
                lineTo(8.071f, 5.056f)
                curveTo(9.476f, 3.963f, 10.179f, 3.416f, 10.955f, 3.206f)
                curveTo(11.639f, 3.021f, 12.361f, 3.021f, 13.045f, 3.206f)
                curveTo(13.821f, 3.416f, 14.524f, 3.963f, 15.929f, 5.056f)
                lineTo(18.529f, 7.078f)
                curveTo(19.436f, 7.783f, 19.889f, 8.136f, 20.216f, 8.578f)
                curveTo(20.505f, 8.969f, 20.721f, 9.41f, 20.852f, 9.878f)
                curveTo(21f, 10.407f, 21f, 10.981f, 21f, 12.13f)
                verticalLineTo(14.6f)
                curveTo(21f, 16.84f, 21f, 17.96f, 20.564f, 18.816f)
                curveTo(20.181f, 19.569f, 19.569f, 20.181f, 18.816f, 20.564f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveTo(7.16f, 21f, 6.04f, 21f, 5.184f, 20.564f)
                curveTo(4.431f, 20.181f, 3.819f, 19.569f, 3.436f, 18.816f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
                moveTo(10.5f, 16f)
                horizontalLineTo(13.5f)
                curveTo(13.966f, 16f, 14.199f, 16f, 14.383f, 15.924f)
                curveTo(14.628f, 15.822f, 14.822f, 15.628f, 14.924f, 15.383f)
                curveTo(15f, 15.199f, 15f, 14.966f, 15f, 14.5f)
                curveTo(15f, 14.034f, 15f, 13.801f, 14.924f, 13.617f)
                curveTo(14.822f, 13.372f, 14.628f, 13.178f, 14.383f, 13.076f)
                curveTo(14.199f, 13f, 13.966f, 13f, 13.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(10.034f, 13f, 9.801f, 13f, 9.617f, 13.076f)
                curveTo(9.372f, 13.178f, 9.178f, 13.372f, 9.076f, 13.617f)
                curveTo(9f, 13.801f, 9f, 14.034f, 9f, 14.5f)
                curveTo(9f, 14.966f, 9f, 15.199f, 9.076f, 15.383f)
                curveTo(9.178f, 15.628f, 9.372f, 15.822f, 9.617f, 15.924f)
                curveTo(9.801f, 16f, 10.034f, 16f, 10.5f, 16f)
                close()
            }
        }.build()

        return _HouseLockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HouseLockAlt: ImageVector? = null
