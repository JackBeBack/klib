package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TreasureChest: ImageVector
    get() {
        if (_TreasureChest != null) {
            return _TreasureChest!!
        }
        _TreasureChest = ImageVector.Builder(
            name = "TreasureChest",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12.498f)
                lineTo(14f, 12.498f)
                moveTo(3f, 12.498f)
                lineTo(10f, 12.498f)
                moveTo(7f, 4.5f)
                verticalLineTo(19.498f)
                moveTo(17f, 4.5f)
                verticalLineTo(19.498f)
                moveTo(6.2f, 19.5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19.5f, 19.48f, 19.5f, 19.908f, 19.282f)
                curveTo(20.284f, 19.09f, 20.59f, 18.784f, 20.782f, 18.408f)
                curveTo(21f, 17.98f, 21f, 17.42f, 21f, 16.3f)
                verticalLineTo(10.9f)
                curveTo(21f, 8.66f, 21f, 7.54f, 20.564f, 6.684f)
                curveTo(20.181f, 5.931f, 19.569f, 5.319f, 18.816f, 4.936f)
                curveTo(17.96f, 4.5f, 16.84f, 4.5f, 14.6f, 4.5f)
                horizontalLineTo(9.4f)
                curveTo(7.16f, 4.5f, 6.04f, 4.5f, 5.184f, 4.936f)
                curveTo(4.431f, 5.319f, 3.819f, 5.931f, 3.436f, 6.684f)
                curveTo(3f, 7.54f, 3f, 8.66f, 3f, 10.9f)
                verticalLineTo(16.3f)
                curveTo(3f, 17.42f, 3f, 17.98f, 3.218f, 18.408f)
                curveTo(3.41f, 18.784f, 3.716f, 19.09f, 4.092f, 19.282f)
                curveTo(4.52f, 19.5f, 5.08f, 19.5f, 6.2f, 19.5f)
                close()
                moveTo(10f, 10.498f)
                horizontalLineTo(14f)
                verticalLineTo(14.498f)
                horizontalLineTo(10f)
                verticalLineTo(10.498f)
                close()
            }
        }.build()

        return _TreasureChest!!
    }

@Suppress("ObjectPropertyName")
private var _TreasureChest: ImageVector? = null
