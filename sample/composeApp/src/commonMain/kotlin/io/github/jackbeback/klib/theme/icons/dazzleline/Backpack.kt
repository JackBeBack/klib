package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Backpack: ImageVector
    get() {
        if (_Backpack != null) {
            return _Backpack!!
        }
        _Backpack = ImageVector.Builder(
            name = "Backpack",
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
                moveTo(6f, 12f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 12f, 3.76f, 12f, 3.546f, 12.109f)
                curveTo(3.358f, 12.205f, 3.205f, 12.358f, 3.109f, 12.546f)
                curveTo(3f, 12.76f, 3f, 13.04f, 3f, 13.6f)
                verticalLineTo(16.4f)
                curveTo(3f, 16.96f, 3f, 17.24f, 3.109f, 17.454f)
                curveTo(3.205f, 17.642f, 3.358f, 17.795f, 3.546f, 17.891f)
                curveTo(3.76f, 18f, 4.04f, 18f, 4.6f, 18f)
                horizontalLineTo(6f)
                moveTo(18f, 12f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 12f, 20.24f, 12f, 20.454f, 12.109f)
                curveTo(20.642f, 12.205f, 20.795f, 12.358f, 20.891f, 12.546f)
                curveTo(21f, 12.76f, 21f, 13.04f, 21f, 13.6f)
                verticalLineTo(16.4f)
                curveTo(21f, 16.96f, 21f, 17.24f, 20.891f, 17.454f)
                curveTo(20.795f, 17.642f, 20.642f, 17.795f, 20.454f, 17.891f)
                curveTo(20.24f, 18f, 19.96f, 18f, 19.4f, 18f)
                horizontalLineTo(18f)
                moveTo(15f, 6f)
                curveTo(15f, 4.343f, 13.657f, 3f, 12f, 3f)
                curveTo(10.343f, 3f, 9f, 4.343f, 9f, 6f)
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                moveTo(10.8f, 21f)
                horizontalLineTo(13.2f)
                curveTo(14.88f, 21f, 15.72f, 21f, 16.362f, 20.673f)
                curveTo(16.927f, 20.385f, 17.385f, 19.927f, 17.673f, 19.362f)
                curveTo(18f, 18.72f, 18f, 17.88f, 18f, 16.2f)
                verticalLineTo(10.8f)
                curveTo(18f, 9.12f, 18f, 8.28f, 17.673f, 7.638f)
                curveTo(17.385f, 7.074f, 16.927f, 6.615f, 16.362f, 6.327f)
                curveTo(15.72f, 6f, 14.88f, 6f, 13.2f, 6f)
                horizontalLineTo(10.8f)
                curveTo(9.12f, 6f, 8.28f, 6f, 7.638f, 6.327f)
                curveTo(7.074f, 6.615f, 6.615f, 7.074f, 6.327f, 7.638f)
                curveTo(6f, 8.28f, 6f, 9.12f, 6f, 10.8f)
                verticalLineTo(16.2f)
                curveTo(6f, 17.88f, 6f, 18.72f, 6.327f, 19.362f)
                curveTo(6.615f, 19.927f, 7.074f, 20.385f, 7.638f, 20.673f)
                curveTo(8.28f, 21f, 9.12f, 21f, 10.8f, 21f)
                close()
            }
        }.build()

        return _Backpack!!
    }

@Suppress("ObjectPropertyName")
private var _Backpack: ImageVector? = null
