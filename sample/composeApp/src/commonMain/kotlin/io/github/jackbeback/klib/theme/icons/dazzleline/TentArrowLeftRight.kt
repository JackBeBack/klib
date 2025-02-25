package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TentArrowLeftRight: ImageVector
    get() {
        if (_TentArrowLeftRight != null) {
            return _TentArrowLeftRight!!
        }
        _TentArrowLeftRight = ImageVector.Builder(
            name = "TentArrowLeftRight",
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
                moveTo(9f, 5f)
                horizontalLineTo(3f)
                moveTo(3f, 5f)
                lineTo(5f, 7f)
                moveTo(3f, 5f)
                lineTo(5f, 3f)
                moveTo(21f, 5f)
                horizontalLineTo(15f)
                moveTo(21f, 5f)
                lineTo(19f, 7f)
                moveTo(21f, 5f)
                lineTo(19f, 3f)
                moveTo(12f, 9f)
                lineTo(16.471f, 12.252f)
                curveTo(16.851f, 12.528f, 17.042f, 12.667f, 17.191f, 12.839f)
                curveTo(17.323f, 12.991f, 17.432f, 13.163f, 17.513f, 13.348f)
                curveTo(17.604f, 13.557f, 17.648f, 13.788f, 17.734f, 14.25f)
                lineTo(18.645f, 19.105f)
                curveTo(18.767f, 19.756f, 18.828f, 20.081f, 18.737f, 20.335f)
                curveTo(18.658f, 20.558f, 18.502f, 20.745f, 18.298f, 20.864f)
                curveTo(18.065f, 21f, 17.734f, 21f, 17.072f, 21f)
                horizontalLineTo(16f)
                moveTo(12f, 9f)
                lineTo(7.529f, 12.252f)
                curveTo(7.149f, 12.528f, 6.959f, 12.667f, 6.809f, 12.839f)
                curveTo(6.677f, 12.991f, 6.568f, 13.163f, 6.487f, 13.348f)
                curveTo(6.396f, 13.557f, 6.352f, 13.788f, 6.266f, 14.25f)
                lineTo(5.355f, 19.105f)
                curveTo(5.233f, 19.756f, 5.172f, 20.081f, 5.263f, 20.335f)
                curveTo(5.342f, 20.558f, 5.498f, 20.745f, 5.702f, 20.864f)
                curveTo(5.935f, 21f, 6.266f, 21f, 6.928f, 21f)
                horizontalLineTo(12f)
                moveTo(12f, 9f)
                verticalLineTo(15f)
                moveTo(12f, 21f)
                horizontalLineTo(16f)
                moveTo(12f, 21f)
                verticalLineTo(15f)
                moveTo(16f, 21f)
                lineTo(12f, 15f)
            }
        }.build()

        return _TentArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _TentArrowLeftRight: ImageVector? = null
