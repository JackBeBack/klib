package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HexagonImage: ImageVector
    get() {
        if (_HexagonImage != null) {
            return _HexagonImage!!
        }
        _HexagonImage = ImageVector.Builder(
            name = "HexagonImage",
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
                moveTo(14.5f, 8.5f)
                horizontalLineTo(14.51f)
                moveTo(16.22f, 19.96f)
                lineTo(10.551f, 14.271f)
                curveTo(9.758f, 13.475f, 9.361f, 13.077f, 8.904f, 12.928f)
                curveTo(8.501f, 12.797f, 8.068f, 12.797f, 7.665f, 12.927f)
                curveTo(7.208f, 13.076f, 6.811f, 13.474f, 6.018f, 14.27f)
                lineTo(4.303f, 15.99f)
                moveTo(12.238f, 15.964f)
                lineTo(12.607f, 15.595f)
                curveTo(13.408f, 14.8f, 13.809f, 14.402f, 14.269f, 14.255f)
                curveTo(14.674f, 14.127f, 15.109f, 14.13f, 15.512f, 14.265f)
                curveTo(15.97f, 14.419f, 16.364f, 14.823f, 17.152f, 15.631f)
                lineTo(18.889f, 17.388f)
                moveTo(18.889f, 17.388f)
                lineTo(21.538f, 12.8f)
                curveTo(21.706f, 12.509f, 21.79f, 12.363f, 21.823f, 12.208f)
                curveTo(21.852f, 12.071f, 21.852f, 11.929f, 21.823f, 11.792f)
                curveTo(21.79f, 11.637f, 21.706f, 11.491f, 21.538f, 11.2f)
                lineTo(17.462f, 4.14f)
                curveTo(17.293f, 3.848f, 17.209f, 3.703f, 17.091f, 3.597f)
                curveTo(16.987f, 3.503f, 16.865f, 3.432f, 16.731f, 3.389f)
                curveTo(16.581f, 3.34f, 16.412f, 3.34f, 16.076f, 3.34f)
                horizontalLineTo(7.923f)
                curveTo(7.587f, 3.34f, 7.419f, 3.34f, 7.268f, 3.389f)
                curveTo(7.135f, 3.432f, 7.012f, 3.503f, 6.908f, 3.597f)
                curveTo(6.79f, 3.703f, 6.706f, 3.848f, 6.538f, 4.14f)
                lineTo(2.461f, 11.2f)
                curveTo(2.293f, 11.491f, 2.209f, 11.637f, 2.176f, 11.792f)
                curveTo(2.147f, 11.929f, 2.147f, 12.071f, 2.176f, 12.208f)
                curveTo(2.209f, 12.363f, 2.293f, 12.509f, 2.461f, 12.8f)
                lineTo(4.303f, 15.99f)
                moveTo(18.889f, 17.388f)
                lineTo(17.462f, 19.86f)
                curveTo(17.293f, 20.152f, 17.209f, 20.298f, 17.091f, 20.403f)
                curveTo(16.987f, 20.497f, 16.865f, 20.568f, 16.731f, 20.611f)
                curveTo(16.581f, 20.66f, 16.412f, 20.66f, 16.076f, 20.66f)
                horizontalLineTo(7.923f)
                curveTo(7.587f, 20.66f, 7.419f, 20.66f, 7.268f, 20.611f)
                curveTo(7.135f, 20.568f, 7.012f, 20.497f, 6.908f, 20.403f)
                curveTo(6.79f, 20.298f, 6.706f, 20.152f, 6.538f, 19.86f)
                lineTo(4.303f, 15.99f)
                moveTo(15f, 8.5f)
                curveTo(15f, 8.776f, 14.776f, 9f, 14.5f, 9f)
                curveTo(14.224f, 9f, 14f, 8.776f, 14f, 8.5f)
                curveTo(14f, 8.224f, 14.224f, 8f, 14.5f, 8f)
                curveTo(14.776f, 8f, 15f, 8.224f, 15f, 8.5f)
                close()
            }
        }.build()

        return _HexagonImage!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonImage: ImageVector? = null
