package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseFlag: ImageVector
    get() {
        if (_HouseFlag != null) {
            return _HouseFlag!!
        }
        _HouseFlag = ImageVector.Builder(
            name = "HouseFlag",
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
                moveTo(10f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                moveTo(15f, 3f)
                verticalLineTo(21f)
                moveTo(15f, 5f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 5f, 20.24f, 5f, 20.454f, 5.109f)
                curveTo(20.642f, 5.205f, 20.795f, 5.358f, 20.891f, 5.546f)
                curveTo(21f, 5.76f, 21f, 6.04f, 21f, 6.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 7.96f, 21f, 8.24f, 20.891f, 8.454f)
                curveTo(20.795f, 8.642f, 20.642f, 8.795f, 20.454f, 8.891f)
                curveTo(20.24f, 9f, 19.96f, 9f, 19.4f, 9f)
                horizontalLineTo(15f)
                moveTo(5f, 10f)
                verticalLineTo(16.2f)
                curveTo(5f, 17.88f, 5f, 18.72f, 5.327f, 19.362f)
                curveTo(5.615f, 19.927f, 6.074f, 20.385f, 6.638f, 20.673f)
                curveTo(7.28f, 21f, 8.12f, 21f, 9.8f, 21f)
                horizontalLineTo(12f)
                moveTo(3f, 12f)
                lineTo(12f, 3f)
            }
        }.build()

        return _HouseFlag!!
    }

@Suppress("ObjectPropertyName")
private var _HouseFlag: ImageVector? = null
