package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodeBranch: ImageVector
    get() {
        if (_CodeBranch != null) {
            return _CodeBranch!!
        }
        _CodeBranch = ImageVector.Builder(
            name = "CodeBranch",
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
                moveTo(18.5f, 8f)
                curveTo(19.881f, 8f, 21f, 6.881f, 21f, 5.5f)
                curveTo(21f, 4.119f, 19.881f, 3f, 18.5f, 3f)
                curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
                curveTo(16f, 6.881f, 17.119f, 8f, 18.5f, 8f)
                close()
                moveTo(18.5f, 8f)
                curveTo(18.5f, 8.93f, 18.5f, 9.395f, 18.398f, 9.776f)
                curveTo(18.12f, 10.812f, 17.312f, 11.62f, 16.277f, 11.898f)
                curveTo(15.895f, 12f, 15.43f, 12f, 14.5f, 12f)
                horizontalLineTo(8.5f)
                curveTo(6.843f, 12f, 5.5f, 13.343f, 5.5f, 15f)
            }
        }.build()

        return _CodeBranch!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBranch: ImageVector? = null
