package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodePullRequestClosed: ImageVector
    get() {
        if (_CodePullRequestClosed != null) {
            return _CodePullRequestClosed!!
        }
        _CodePullRequestClosed = ImageVector.Builder(
            name = "CodePullRequestClosed",
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
                moveTo(6.5f, 8f)
                curveTo(7.881f, 8f, 9f, 6.881f, 9f, 5.5f)
                curveTo(9f, 4.119f, 7.881f, 3f, 6.5f, 3f)
                curveTo(5.119f, 3f, 4f, 4.119f, 4f, 5.5f)
                curveTo(4f, 6.881f, 5.119f, 8f, 6.5f, 8f)
                close()
                moveTo(6.5f, 8f)
                verticalLineTo(16f)
                moveTo(6.5f, 16f)
                curveTo(5.119f, 16f, 4f, 17.119f, 4f, 18.5f)
                curveTo(4f, 19.881f, 5.119f, 21f, 6.5f, 21f)
                curveTo(7.881f, 21f, 9f, 19.881f, 9f, 18.5f)
                curveTo(9f, 17.119f, 7.881f, 16f, 6.5f, 16f)
                close()
                moveTo(17.5f, 16f)
                verticalLineTo(12f)
                moveTo(17.5f, 16f)
                curveTo(18.881f, 16f, 20f, 17.119f, 20f, 18.5f)
                curveTo(20f, 19.881f, 18.881f, 21f, 17.5f, 21f)
                curveTo(16.119f, 21f, 15f, 19.881f, 15f, 18.5f)
                curveTo(15f, 17.119f, 16.119f, 16f, 17.5f, 16f)
                close()
                moveTo(20f, 3f)
                lineTo(15f, 8f)
                moveTo(15f, 3f)
                lineTo(20f, 8f)
            }
        }.build()

        return _CodePullRequestClosed!!
    }

@Suppress("ObjectPropertyName")
private var _CodePullRequestClosed: ImageVector? = null
