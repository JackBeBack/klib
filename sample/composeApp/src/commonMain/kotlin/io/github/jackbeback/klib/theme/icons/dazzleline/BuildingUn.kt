package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingUn: ImageVector
    get() {
        if (_BuildingUn != null) {
            return _BuildingUn!!
        }
        _BuildingUn = ImageVector.Builder(
            name = "BuildingUn",
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
                moveTo(13.5f, 11f)
                verticalLineTo(7f)
                lineTo(16.5f, 11f)
                verticalLineTo(7f)
                moveTo(7.5f, 7f)
                verticalLineTo(9.5f)
                curveTo(7.5f, 10.328f, 8.172f, 11f, 9f, 11f)
                curveTo(9.828f, 11f, 10.5f, 10.328f, 10.5f, 9.5f)
                verticalLineTo(7f)
                moveTo(15.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(7.8f)
                curveTo(4f, 6.12f, 4f, 5.28f, 4.327f, 4.638f)
                curveTo(4.615f, 4.074f, 5.074f, 3.615f, 5.638f, 3.327f)
                curveTo(6.28f, 3f, 7.12f, 3f, 8.8f, 3f)
                horizontalLineTo(15.2f)
                curveTo(16.88f, 3f, 17.72f, 3f, 18.362f, 3.327f)
                curveTo(18.927f, 3.615f, 19.385f, 4.074f, 19.673f, 4.638f)
                curveTo(20f, 5.28f, 20f, 6.12f, 20f, 7.8f)
                verticalLineTo(16.2f)
                curveTo(20f, 17.88f, 20f, 18.72f, 19.673f, 19.362f)
                curveTo(19.385f, 19.927f, 18.927f, 20.385f, 18.362f, 20.673f)
                curveTo(17.72f, 21f, 16.88f, 21f, 15.2f, 21f)
                close()
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _BuildingUn!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingUn: ImageVector? = null
