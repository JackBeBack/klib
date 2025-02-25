package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodePullRequest: ImageVector
    get() {
        if (_CodePullRequest != null) {
            return _CodePullRequest!!
        }
        _CodePullRequest = ImageVector.Builder(
            name = "CodePullRequest",
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
                moveTo(5.5f, 8f)
                curveTo(6.881f, 8f, 8f, 6.881f, 8f, 5.5f)
                curveTo(8f, 4.119f, 6.881f, 3f, 5.5f, 3f)
                curveTo(4.119f, 3f, 3f, 4.119f, 3f, 5.5f)
                curveTo(3f, 6.881f, 4.119f, 8f, 5.5f, 8f)
                close()
                moveTo(5.5f, 8f)
                verticalLineTo(16f)
                moveTo(5.5f, 16f)
                curveTo(4.119f, 16f, 3f, 17.119f, 3f, 18.5f)
                curveTo(3f, 19.881f, 4.119f, 21f, 5.5f, 21f)
                curveTo(6.881f, 21f, 8f, 19.881f, 8f, 18.5f)
                curveTo(8f, 17.119f, 6.881f, 16f, 5.5f, 16f)
                close()
                moveTo(18.5f, 16f)
                verticalLineTo(8.7f)
                curveTo(18.5f, 7.58f, 18.5f, 7.02f, 18.282f, 6.592f)
                curveTo(18.09f, 6.216f, 17.784f, 5.91f, 17.408f, 5.718f)
                curveTo(16.98f, 5.5f, 16.42f, 5.5f, 15.3f, 5.5f)
                horizontalLineTo(12f)
                moveTo(18.5f, 16f)
                curveTo(19.881f, 16f, 21f, 17.119f, 21f, 18.5f)
                curveTo(21f, 19.881f, 19.881f, 21f, 18.5f, 21f)
                curveTo(17.119f, 21f, 16f, 19.881f, 16f, 18.5f)
                curveTo(16f, 17.119f, 17.119f, 16f, 18.5f, 16f)
                close()
                moveTo(12f, 5.5f)
                lineTo(14.5f, 8f)
                moveTo(12f, 5.5f)
                lineTo(14.5f, 3f)
            }
        }.build()

        return _CodePullRequest!!
    }

@Suppress("ObjectPropertyName")
private var _CodePullRequest: ImageVector? = null
