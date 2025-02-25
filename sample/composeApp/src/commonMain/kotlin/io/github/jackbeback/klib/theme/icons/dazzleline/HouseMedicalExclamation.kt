package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseMedicalExclamation: ImageVector
    get() {
        if (_HouseMedicalExclamation != null) {
            return _HouseMedicalExclamation!!
        }
        _HouseMedicalExclamation = ImageVector.Builder(
            name = "HouseMedicalExclamation",
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
                moveTo(19f, 16f)
                verticalLineTo(18f)
                moveTo(19f, 21f)
                horizontalLineTo(19.01f)
                moveTo(12f, 12f)
                verticalLineTo(16f)
                moveTo(14f, 14f)
                horizontalLineTo(10f)
                moveTo(5f, 9.778f)
                verticalLineTo(16.2f)
                curveTo(5f, 17.88f, 5f, 18.72f, 5.327f, 19.362f)
                curveTo(5.615f, 19.927f, 6.074f, 20.385f, 6.638f, 20.673f)
                curveTo(7.28f, 21f, 8.12f, 21f, 9.8f, 21f)
                horizontalLineTo(14f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.652f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.652f)
                curveTo(10.284f, 3.905f, 9.667f, 4.592f, 8.431f, 5.965f)
                lineTo(3f, 12f)
            }
        }.build()

        return _HouseMedicalExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _HouseMedicalExclamation: ImageVector? = null
