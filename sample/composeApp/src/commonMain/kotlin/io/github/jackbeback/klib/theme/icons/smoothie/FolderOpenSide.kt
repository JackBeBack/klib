package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.FolderOpenSide: ImageVector
    get() {
        if (_FolderOpenSide != null) {
            return _FolderOpenSide!!
        }
        _FolderOpenSide = ImageVector.Builder(
            name = "FolderOpenSide",
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
                moveTo(4f, 9f)
                verticalLineTo(6.472f)
                curveTo(4f, 6.162f, 4.072f, 5.855f, 4.211f, 5.578f)
                lineTo(5f, 4f)
                horizontalLineTo(10f)
                lineTo(11f, 6f)
                horizontalLineTo(21f)
                curveTo(21.552f, 6f, 22f, 6.448f, 22f, 7f)
                verticalLineTo(9f)
                verticalLineTo(18f)
                curveTo(22f, 19.105f, 21.105f, 20f, 20f, 20f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(17.236f, 9f)
                horizontalLineTo(2.309f)
                curveTo(1.65f, 9f, 1.171f, 9.627f, 1.344f, 10.263f)
                lineTo(3.598f, 18.526f)
                curveTo(3.835f, 19.396f, 4.626f, 20f, 5.528f, 20f)
                horizontalLineTo(19.691f)
                curveTo(20.35f, 20f, 20.829f, 19.373f, 20.656f, 18.737f)
                lineTo(18.201f, 9.737f)
                curveTo(18.082f, 9.302f, 17.687f, 9f, 17.236f, 9f)
                close()
            }
        }.build()

        return _FolderOpenSide!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenSide: ImageVector? = null
