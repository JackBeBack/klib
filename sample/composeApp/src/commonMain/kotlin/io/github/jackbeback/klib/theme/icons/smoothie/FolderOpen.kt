package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) {
            return _FolderOpen!!
        }
        _FolderOpen = ImageVector.Builder(
            name = "FolderOpen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 9f)
                verticalLineTo(7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                horizontalLineTo(10f)
                lineTo(9f, 4f)
                horizontalLineTo(4f)
                lineTo(3.211f, 5.578f)
                curveTo(3.072f, 5.855f, 3f, 6.162f, 3f, 6.472f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.913f, 20f)
                horizontalLineTo(20.087f)
                curveTo(20.604f, 20f, 21.036f, 19.606f, 21.083f, 19.09f)
                lineTo(21.901f, 10.09f)
                curveTo(21.954f, 9.505f, 21.493f, 9f, 20.905f, 9f)
                horizontalLineTo(3.095f)
                curveTo(2.507f, 9f, 2.046f, 9.505f, 2.099f, 10.09f)
                lineTo(2.917f, 19.09f)
                curveTo(2.964f, 19.606f, 3.396f, 20f, 3.913f, 20f)
                close()
            }
        }.build()

        return _FolderOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpen: ImageVector? = null
